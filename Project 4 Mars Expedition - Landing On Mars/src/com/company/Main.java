// Zinedin Bautista
// I estimate this project to take me an hour.
// This project took me a little over an hour.

package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // *OBJECTIVE STATUS REPORT*
        // Spaceship
        // Base
        // Health status
        // Oxygen level
        // Crew tool
        // Crew members

        // Introduction.
        System.out.println("*** Welcome back captain ***\n");
        System.out.println("* This program's purpose is to: *\n");

        System.out.println("\t* Report on the status of the ship. *");
        System.out.println("\t* Report on the status of the crew. *\n");
        // Divider
        System.out.println("-------------------------------------------------");

        System.out.println("* Status report on the spaceship. *");

        // Initialized variables for spaceship.
        Spaceship mySpaceship = new Spaceship(5,true,100,"LAAT");

        // Print out status report on the spaceship.
        System.out.println("\t- Ship Model: " + mySpaceship.M);
        System.out.println("\t- Number of Seats: " + mySpaceship.S);
        // If else statement to report if the space drone is available.
        if (mySpaceship.D == true)
        {
            System.out.println("\t- Is Drone Available: Yes");
        }
        else
        {
            System.out.println("\t- Is Drone Available: No");
        }
        System.out.println("\t- Ship Force-Field Capacity: " + mySpaceship.FC + "%");

        // Divider
        System.out.println("-------------------------------------------------------");

        System.out.println("* Status report on the spaceship weapon. *");

        // Initialized variables for ship weapons.
        ShipWeapons myShipWeapons = new ShipWeapons(9000, "Ti-83", true, 9000, true, 9000);

        // Print out status report on the spaceship's weapon.
        System.out.println("\t- Ammunition Rounds: " + myShipWeapons.A + " Available");
        System.out.println("\t- Weapon Model Name: " + myShipWeapons.W);
        // If else statement to report if incendiary rounds are available.
        if(myShipWeapons.I == true)
        {
            System.out.println("\t- Is Incendiary Rounds Available: Yes");
            System.out.println("\t- Incendiary Rounds: " + myShipWeapons.IA + " Available");
        }
        else
        {
            System.out.println("\t- Is Incendiary Rounds Available: No");
        }
        // If else statement to report if explosive rounds are available.
        if(myShipWeapons.E == true)
        {
            System.out.println("\t- Is Explosive Rounds Available: Yes");
            System.out.println("\t- Explosive Rounds: " + myShipWeapons.EA + " Available");
        }
        else
        {
            System.out.println("\t- Is Explosive Rounds Available: No");
        }

        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* Status report on the base stats.*");

        // Initialized variables for the base.
        BaseStats myBaseStats = new BaseStats(100,100,100,true);

        // Print out status report on the Base.
        System.out.println("\t- Energy Level at: " + myBaseStats.E + "%");
        System.out.println("\t- Oxygen Level at: " + myBaseStats.O + "%");
        System.out.println("\t- Base Force field at: " + myBaseStats.BF + "%");
        // If else statement to report if the rover is available.
        if(myBaseStats.BR == true)
        {
            System.out.println("\t- Is Base Rover Available: Yes");
        }
        else
        {
            System.out.println("\t- Is Base Rover Available: No");
        }

        // Divider.
        System.out.println("-------------------------------------------------------");

        System.out.println("* Status report on crew base. *");

        BaseMembers MarsExploration = new BaseMembers("Mars Exploration 1");

        // Create crew status report on Levi.
        CrewStatus ExplorationMember = CreateCrewStatus("Levi", "Captain"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Levi into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Siraj.
        ExplorationMember = CreateCrewStatus("Siraj", "Engineer"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Siraj into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Tom.
        ExplorationMember = CreateCrewStatus("Tom", "Soldier"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Tom into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Jenny.
        ExplorationMember = CreateCrewStatus("Jenny", "Doctor"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Jenny into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create crew status report on Nile.
        ExplorationMember = CreateCrewStatus("Nile", "Scientist"
                , new CrewTool[]{new MarsSuit("Exceptional")
                        , new HealthStatus("Healthy")});

        // Add the crew member Nile into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Conclusion
        System.out.println("-------------------------------------------------------");
        System.out.println("\n* Status report complete. *");
        System.out.println("* Have a nice day. *");
    }

    // Constant on the instructions on how to process and produces a status report on each crew member.
    private static CrewStatus CreateCrewStatus(String name, String role, CrewTool [] crewtools)
    {
        CrewStatus newCrewMember = new CrewStatus();

        // Initialized variables correlated to CrewStatus.
        newCrewMember.Name = name;
        newCrewMember.Role = role;

        // for loop on the adding crew tool to the list.
        for(CrewTool crewTool : crewtools)
        {
            newCrewMember.AddCrewTool(crewTool);
        }

        // Report on each crew member with there name, role, suit condition, and crew health.
        System.out.println("Crew Member: " + newCrewMember.Name + ", " + newCrewMember.Role + ":");
        System.out.println("\t- Suit Condition: "+ newCrewMember.CrewTool.get(0).toString());
        System.out.println("\t- Crew Health Status: " + newCrewMember.CrewTool.get(1).toString());

        return newCrewMember;
    }

}