package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 23
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Is the car silent when you turn the key?. ");
        String userInput = in.nextLine();

        if(userInput.equals("Y") || userInput.equals("y")) {

            System.out.println("Are the battery terminals corroded?. ");
            userInput = in.nextLine();

            if(userInput.equals("Y") || userInput.equals("y")) {

                System.out.println("Clean the terminals and try starting again. ");

            }

            else{

                System.out.println("Replace the cables and try again. ");

            }

        }

        else{

            System.out.println("Does the car make a ticking noise? ");
            userInput = in.nextLine();

            if(userInput.equals("Y") || userInput.equals("y")){

                System.out.println("Replace the battery. ");

            }

            else{

                System.out.println("Does the car crank up but fail to start? ");
                userInput = in.nextLine();

                if (userInput.equals("Y") || userInput.equals("y")){

                    System.out.println("Check the spark plug connections. ");

                }

                else{

                    System.out.println("Does the engine start and then die? ");
                    userInput = in.nextLine();

                    if(userInput.equals("Y") || userInput.equals("y")){

                        System.out.println("Does the car have fuel injection? ");
                        userInput = in.nextLine();

                        if(userInput.equals("Y") || userInput.equals("y")){

                            System.out.println("Get it in for service? ");

                        }

                        else{

                            System.out.println("Check to ensure the choke is opening and closing? ");

                        }

                    }

                    else{

                        System.out.println("This should not be possible ");

                    }

                }

            }

        }

    }

}
