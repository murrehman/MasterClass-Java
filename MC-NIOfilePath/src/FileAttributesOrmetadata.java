import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesOrmetadata {

	public static void main(String[] args) throws IOException {
		
		
		Path filePath = FileSystems.getDefault().getPath("file1.txt");
		long size = Files.size(filePath);
		System.out.println("Size: " + size);
		System.out.println("LastModified: " + Files.getLastModifiedTime(filePath));
		
		
// GET ALL ATRIBUTES|METADATA AT ONCE With BUILTIN CLASS
		
		
		BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
		System.out.println("Size: " + attrs.size());
		System.out.println("Last modified: " + attrs.lastModifiedTime());
		System.out.println("Created: " + attrs.creationTime());
		System.out.println("Is Directory?: " + attrs.isDirectory());
		System.out.println("Is regular file?: " + attrs.isRegularFile());

	}

}
