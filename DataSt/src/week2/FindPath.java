package week2;
//0 no			
//1 �Ʒ�		Y+1:	
//10 ��		Y-1
//100 ������	X+1
//1000 ����	X-1
//(0,2) -> (2,0)
public class FindPath {
	public static int findPath(int map[][], int x, int y) {
		if(x==2&&y==0)
			return 1;
		else if(map[y][x] == 1) 
			return findPath(map, x, y+1);
		else if(map[y][x] == 10) 
			return findPath(map, x, y-1);
		else if(map[y][x] == 100) 
			return findPath(map, x+1, y);
		else if(map[y][x] == 1000) 
			return findPath(map, x-1, y);
		else 
			return 0;
	}

	public static void main(String[] args) {
		int Y=2, X=0;
		int map1[][] = {{   0, 100,  0 },
					    { 100,  10,  0 },
					    {  10,   0,  0 }};
		
		int map2[][] = {{   0, 1000, 0 },
					    { 100,   10, 0 },
						{  10,    0, 0 }};
		
		System.out.println("map1 ��� Ž�� ");
		if(findPath(map1, X, Y) == 1) {
			System.out.println("Found a path!");
		}else {
			System.out.println("There is no path");
		}
		
		System.out.println("map2 ��� Ž�� ");
		if(findPath(map2, X, Y) == 1) {
			System.out.println("Found a path!");
		}else {
			System.out.println("There is no path");
		}
	}
}
