package week8_assignment;

/*
Access Management System
    - Java enum for declaring relative constant access (view, edit, delete)
    - switch statements
    - define permission based on roles
 */

import java.util.Scanner;

enum Role {
    ADMIN,
    USER,
    GUEST
}

class User {
    private String username;
    private Role role;

    User (String username, Role role) {
        this.username = username;
        this.role= role;
    }

    public String getUsername() {
        return username;
    }

    public Role getRole() {
        return role;
    }

    public void performAction(String action) {
        System.out.println("\n[" + username + "] Trying to perform: " + action.toUpperCase());

        switch (role) {
            case ADMIN :
                System.out.println("Access granted: ADMIN can perform all actions.");
                break;
            case USER:
                if(action.equalsIgnoreCase("view") || action.equalsIgnoreCase("edit")) {
                    System.out.println("Access granted: USER can " + action);
                } else {
                    System.out.println("Action denied: USER can't " + action);
                }
                break;
            case GUEST:
                if(action.equalsIgnoreCase("view")) {
                    System.out.println("Access granted: GUEST can view only.");
                } else {
                    System.out.println("Access denied: GUEST can't " + action);
                }
                break;
            default:
                System.out.println("Unknown role.");
        }
    }
}

public class AccessManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username to assign role to: ");
        String username = scanner.nextLine();

        System.out.print("Enter role (ADMIN / USER / GUEST): ");
        String roleInput = scanner.nextLine().toUpperCase();

        Role assignedRole;

        try {
            assignedRole = Role.valueOf(roleInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role! Defaulting to GUEST.");
            assignedRole = Role.GUEST;
        }

        User user = new User(username, assignedRole);

        System.out.println("What action do you want to take on behalf of " + username + " ? (view, edit, delete)");
        String actions = scanner.nextLine();

        user.performAction(actions);

        scanner.close();
    }
}
