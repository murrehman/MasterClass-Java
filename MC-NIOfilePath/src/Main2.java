import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main2 {

	public static void main(String[] args) {
		
//  1-		
//  READING A DIRECTORY AND ITS CONTENTS
		
		
		Path directory = FileSystems.getDefault().getPath("folder6");
		try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory)) {
			for(Path file : contents) {
				System.out.println(file.getFileName());
			}
		}catch(IOException | DirectoryIteratorException e) {
			System.out.println(e.getMessage());
		}
		
		
//  2-		
//  READING SPECIFIC EXTENSIONS/NAME FILE IN DIRECTORY
		
		
		Path direc = FileSystems.getDefault().getPath("folder6");
		try(DirectoryStream<Path> content = Files.newDirectoryStream(direc, "*.dat")) {
			for(Path f : content) {
				System.out.println(f.getFileName());
			}
		}catch(IOException | DirectoryIteratorException e) {
			System.out.println(e.getMessage());
		}
		
		
// 3-		
// READING ONLY FILES IN FOLDER INSTEAD OF INNER FOLDERS
		
		
		DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
			public boolean accept(Path path) throws IOException {
				return (Files.isRegularFile(path));
			}
		};
		Path dir = FileSystems.getDefault().getPath("folder6");
		try(DirectoryStream<Path> contentss = Files.newDirectoryStream(dir, filter)) {
			for(Path filee : contentss) {
				System.out.println(filee.getFileName());
			}
		}catch(IOException | DirectoryIteratorException e) {
			System.out.println(e.getMessage());
		}
		
		
// 4-		
// DOING SAME AS 3 BUT WITH LAMBDA
		
		
		DirectoryStream.Filter<Path> filterr = p -> Files.isRegularFile(p);
		
		Path dirr = FileSystems.getDefault().getPath("folder6");
		try(DirectoryStream<Path> contentsss = Files.newDirectoryStream(dirr, filterr)) {
			for(Path fileee : contentsss) {
				System.out.println(fileee.getFileName());
			}
		}catch(IOException | DirectoryIteratorException e) {
			System.out.println(e.getMessage());
		}

	}

}
