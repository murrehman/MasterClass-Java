import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {

		Path path = FileSystems.getDefault().getPath("workingdirectoryPath.txt");
		Path path2 = FileSystems.getDefault().getPath("C:\\Users\\me.txt");
		Path path3 = Paths.get(".");
		System.out.println(path.toAbsolutePath());
		System.out.println(path3.toAbsolutePath());

		System.out.println(" EXISTS: " + Files.exists(path3));
		System.out.println(" EXISTS: " + Files.exists(path2));

		System.out.println(" EXISTS: " + Files.isReadable(path3));

	
		
		
// COPYING FILE WITH JAVA NIO PATH
		
		

		Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
		Path copyFile = FileSystems.getDefault().getPath("File1copy.txt");
		// Files.copy(sourceFile, copyFile);

		Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

		
		
		
// COPYING DIRECTORY ONLY WIHOUT FILES
		
		
		

		Path sourceFolder = FileSystems.getDefault().getPath("folder1");
		Path copyFolder = FileSystems.getDefault().getPath("copyfolder1");
		// Files.copy(sourceFolder, copyFolder);
		Files.copy(sourceFolder, copyFolder, StandardCopyOption.REPLACE_EXISTING);

		
		
		
		
		
// MOVING FILE
		
		
		

		Path fileToMove = FileSystems.getDefault().getPath("File1copy.txt");
		Path destination = FileSystems.getDefault().getPath("folder1", "File1copy.txt");
		// Files.move(fileToMove, destination);
		Files.move(fileToMove, destination, StandardCopyOption.REPLACE_EXISTING);

		
		
		
		
		
// RENAMING FILE
		
		
		

		Path fileToRename = FileSystems.getDefault().getPath("file1.txt");
		Path Renamedfile = FileSystems.getDefault().getPath("file2.txt");
		Files.move(fileToRename, Renamedfile, StandardCopyOption.REPLACE_EXISTING);
		
		
// CREATING FILE
		
		
		Path fileToCreate = FileSystems.getDefault().getPath("file1.txt");
		Files.createFile(fileToCreate);
	
		
		
// DELETING A FILE
		
		
		

		Path fileToDelete = FileSystems.getDefault().getPath("folder1", "File1copy.txt");
		Files.deleteIfExists(fileToDelete);
		
		
		
// CREATING DIRECTORY
		
		
		Path DirToCreate = FileSystems.getDefault().getPath("folder5");
		Files.createDirectory(DirToCreate);
		
		

// DELETING A DIRECTORY
		
		
		Path DirToDelete = FileSystems.getDefault().getPath("folder5");
		Files.deleteIfExists(DirToDelete);
		
		
		
		
// CREATING MORE THAN ONE DIRECTORY
		
		
		
		Path DirsToCreate = FileSystems.getDefault().getPath("folder6\\f7\\f8\\f9");
		Files.createDirectories(DirsToCreate);
		
		
		
		
		
		
		
		

	}

}
