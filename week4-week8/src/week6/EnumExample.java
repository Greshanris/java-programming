package week6;

// week 5 : Day 3: Wednesday

/*
enum: enumeration
- A special class that represent a group of constants (unchangeable variables, like final variables).
- Enums are useful when we have a fixed set of related constants that we want to group together.
  */

enum Level {
    LOW, MEDIUM, HIGH
}
/*
So, here:
- "Level" or "Permission" : is an enum type
- "LOW, MEDIUM, HIGH" or "VIEW, CREATE, EDIT, DELETE" : are enum constants, a fixed set of related constants
 */

// so, here we declared Enums
enum Permission {
    VIEW, CREATE, EDIT, DELETE
}

public class EnumExample {
    public static void main(String[] args) {

        // here, userPermission of type "Permission" is assigned value "Create"
        Permission userPermission = Permission.CREATE;

        // We used "switch" statement to check the value of "userPermission"
        // if the value equals CREATE, then we print in the console
        switch (userPermission) {
            case EDIT:
                System.out.println("User has EDIT permission");
                break;
            case CREATE:
                System.out.println("User has CREATE permission");
                break;
            case DELETE:
                System.out.println("User has DELETE permission");
                break;
            case VIEW:
                System.out.println("User has VIEW permission");
                break;
        }

        // Here, we created a list of permission: User have {"CREATE", "VIEW"} in an array
        String[] userPermissionsArray = { "CREATE", "VIEW" };

        // we used for-each loop, stored value of each iteration in "userPer"
        // Now, we checked if "userPer.equals(Permission.VIEW.name())" is true, then we print out userPer
        // .name() converts the constant we declared in Permission into String, because we need String to compare with string.
        for (String userPer : userPermissionsArray) {
            if (userPer.equals(Permission.VIEW.name())) {
                System.out.println(userPer);
            }
        }

    }
}