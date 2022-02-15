import java.util.*;



public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		
		Album album = new Album("Album 1", "Deep purple");
		album.addSong("SongName1", 3.22);
		album.addSong("SongName2", 4.45);
		album.addSong("SongName3", 5.00);
		album.addSong("SongName4", 3.55);
		album.addSong("SongName5", 6.02);
		album.addSong("SongName6", 8.11);
		album.addSong("SongName7", 7.00);
		album.addSong("SongName8", 2.33);
		album.addSong("SongName9", 3.03);
		albums.add(album);
		
		album = new Album("Album 2", "AC/DC");
		album.addSong("SongName11", 3.22);
		album.addSong("SongName12", 4.45);
		album.addSong("SongName13", 5.00);
		album.addSong("SongName14", 3.55);
		album.addSong("SongName15", 6.02);
		album.addSong("SongName16", 8.11);
		album.addSong("SongName17", 7.00);
		album.addSong("SongName18", 2.33);
		album.addSong("SongName19", 3.03);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("SongName5", playList);
		albums.get(0).addToPlayList("SongName6", playList);
		albums.get(0).addToPlayList("SongName10", playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(6, playList);
		albums.get(1).addToPlayList(9, playList);
		albums.get(0).addToPlayList(24, playList);
		
		play(playList);

	}
	
	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		}else {
			System.out.println("Now Playing "+ listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("PlayList Complete.");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}  
				
				if(listIterator.hasNext()) {
					System.out.println("NOW PLAYING "+ listIterator.next().toString());
				}else {
					System.out.println("We are at the END of playlist");
					//forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}  
				
				if(listIterator.hasPrevious()) {
					System.out.println("NOW PLAYING "+ listIterator.previous().toString());
				}else {
					System.out.println("We are at the START of playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("NOW PLAYING "+ listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are at the START of playlist");
						forward = true;
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("NOW PLAYING "+ listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("We are at the END of playlist");
						
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now Playing "+ listIterator.next());
					}else if(listIterator.hasPrevious()) {
						System.out.println("Now Playing " + listIterator.previous());
					}
				}
				break;
			}
				
		}
		
		}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress: \n" +
	                       "0 - to quit\n" +
	                       "1 - to play next song\n" +
	                       "2 - to to play previous song\n" +
	                       "3 - to replay the current song\n" +
	                       "4 - List songs in the PLAYLIST\n" +
	                       "5 - Show available actions\n" +
	                       "6 - Delete Current song from playList\n");
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("====================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====================================");
	}

}
