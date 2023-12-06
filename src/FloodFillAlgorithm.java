
public class FloodFillAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] image={
{1,1,1,2,2},
{1,1,1,2,2},
{1,1,2,2,2},
{3,3,3,3,3},
{3,3,3,3,3}};
System.out.println("Original image: ");
printImage(image);
int startRow=2,startCol=2;
int oldColor=image[startRow][startCol];
int newColor=4;
floodFill(image,startRow,startCol,oldColor,newColor);
System.out.println("\nImage after flood fill:");
printImage(image);
	}
	public static void floodFill(int[][] image,int row,int col,int oldColor,int newColor
			) {
		int rows=image.length;
		int cols=image[0].length;
		if(row<0 || row>=rows || col<0 || col>=cols || image[row][col] != oldColor) {
			return;
		}
		image[row][col]=newColor;
		floodFill(image,row+1,col,oldColor,newColor);
		floodFill(image,row-1,col,oldColor,newColor);
		floodFill(image,row,col+1,oldColor,newColor);
		floodFill(image,row,col-1,oldColor,newColor);
				
	}
	public static void printImage(int[][] image) {
		for(int[] row : image) {
			for(int pixel : row) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
	}
}
