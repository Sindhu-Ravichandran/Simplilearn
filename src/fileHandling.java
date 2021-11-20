import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\nWelcome!");
			System.out.println("1. Retrive all the files from the folder");
			System.out.println("2. File operations");
			System.out.println("3. Close the application");

			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				File newFolder = new File("E:\\SimplileranSelfLearning\\Phase1_File_Handling\\InputFiles");
				File retrive_files[] = newFolder.listFiles();
				System.out.print("The list of files present are :\n");
				for (File fileObj : retrive_files) {
					System.out.println(fileObj);
				}
				break;
			case 2:
				int file_choice;
				do {
					System.out.println("\n1.Create a new file");
					System.out.println("2.Delete the a file");
					System.out.println("3.Search for a specified file");
					System.out.println("4.Return to pervious menu");
					file_choice = sc.nextInt();

					switch (file_choice) {
					case 1:
						System.out.println("Please enter the file name : ");
						String fileName = sc.next();
						File newFile = new File(
								"E:\\SimplileranSelfLearning\\Phase1_File_Handling\\InputFiles\\" + fileName);
						try {
							if (newFile.createNewFile())
								System.out.println("file Created :"+newFile);
							else
								System.out.println("File Exists :"+fileName);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 2:
						System.out.println("Enter the file name to be deleted");
						String filename = sc.next();
						File file = new File(
								"E:\\SimplileranSelfLearning\\Phase1_File_Handling\\InputFiles\\" + filename);
						if (file.exists()) {
							file.delete();
							System.out.println("File deleted");
						} else {
							System.out.println("the file entered is not present");
						}
						break;
					case 3:
						System.out.println("Enter the file to be searched: ");
						String search_file = sc.next();
						File s_file = new File("E:\\SimplileranSelfLearning\\Phase1_File_Handling\\InputFiles\\");
						File fileArray[] = s_file.listFiles();
						for (File file_obj : fileArray) {
							if (file_obj.getName().startsWith(search_file)) {
								System.out.println("The file your search for is/are: " + file_obj.getName());
							}
							else {
								System.out.println("The file you are searching is not present");
							}
						}
						break;
					}
				} while (file_choice < 4);
				break;

			case 3:
				System.out.println("Thanks for using this application!");
				System.exit(0);
				break;

			default:
				System.out.println("Program terminated successfully!");
			}
		} while (choice <= 3);
	}

}
