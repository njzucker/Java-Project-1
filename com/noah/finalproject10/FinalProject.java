package com.noah.finalproject10;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalProject {
	static ArrayList<Task> taskList;
	static Scanner check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		taskList = new ArrayList<Task>();
		check = new Scanner(System.in);
		boolean isGoing = true;
		
		do {
			displayTask();
			int userDecision = readDecision();
			
			switch(userDecision) {
			case 1: // add a task
				addMenu();
				String taskName = check.nextLine();
				addTask(taskName);
				break;
			case 2: // remove a task
				removeMenu();
				String eraseName = check.nextLine();
				removeTask(eraseName);
				break;
			case 3: // mark task complete
				markMenu();
				String finishName = check.nextLine();
				markTask(finishName);
				break;
			case 4: // list out tasks
				listMenu();
				String organizeName = check.nextLine();
				listTask(organizeName);
				break;
			case 0: // quit
				isGoing = false;
				break;
				
			}
		}while(isGoing);
		
	}
	public static void addTask(String name) {
		taskList.add(new Task(name));
	}
	public static void addMenu() {
		System.out.println("Which task do you want to add?");
	}
	public static void removeTask(String name) {
		taskList.remove(new Task(name));
	}
	public static void removeMenu() {
		System.out.println("Which task do you want to remove?");
	}
	public static void markTask(String name) {
		taskList.add(new Task(name));
	}
	public static void markMenu() {
		System.out.println("Which task do you want to mark complete?");
	}
	public static void listTask(String name) {
		taskList.add(new Task(name));
	}
	public static void listMenu() {
		System.out.println("Show me the task list");
	}
	
	public static void displayTask() {
		System.out.println("MAIN MENU");
		System.out.println("1. Add a task");
		System.out.println("2. Remove a task");
		System.out.println("3. Mark a task complete");
		System.out.println("4. List the tasks");
		System.out.println("0. QUIT");
		System.out.println("What would you like to do?");
	}
	
	public static int readDecision() {
		int result = check.nextInt();
		check.nextLine();
		return result;
	}

}
