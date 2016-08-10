import java.io.*;
public class CandidateCode
{
    private class Pixel {
        int value;
        boolean isVisited;

        public Pixel(int value) {
            this.value = value;
            this.isVisited = false;
        }

        public void setVisited(boolean isVisited) {
            this.isVisited = isVisited;
        }

        public int getValue() {
            return this.value;
        }

        public boolean isVisited() {
            return this.isVisited;
        }
    }

    public static int pixelValue(int[] input1,int[] input2)
    {
        //Write code here
        int m = input1[0], n = input1[1];
        //Construct pixelsArray
        Pixel[][] pixelsArray = constructPixelsArray(input2, m, n);

        //Count pixelsObjects
        return countObjects(pixelsArray, m, n);
    }

    private static int countObjects(Pixel[][] pixelsArray, int m, int n) {
        return 0;
    }

    private static Pixel[][] constructPixelsArray(int[] input2, int m, int n) {
        Pixel[][] pixelsArray = new Pixel[m][n];
        CandidateCode canCode = new CandidateCode();
        int i=0;
        int xIndex = 0, yIndex = 0;
        while(i<input2.length-1) {
            int j = input2[i+1];
            int numberOfJs = input2[i];
            for(int k = 1 ; k <= numberOfJs ; k++) {
                if(yIndex >= n) {
                    xIndex++;
                    yIndex = 0;
                }
                pixelsArray[xIndex][yIndex] = canCode.new Pixel(j);
                yIndex++;
            }
            i+=2;
        }
        for(i = 0; i<m; i++){
            for(int j=0; j<n;j++){
                System.out.print(pixelsArray[i][j].getValue() + " ");
            }
            System.out.println();
        }
        return pixelsArray;
    }

    public static void main(String args[]) {
        int[] matrix = new int[]{6, 0, 2, 1, 4, 0};
        System.out.println(CandidateCode.pixelValue(new int[]{3, 4}, matrix));
        //matrix = new int[]{11,0,2,1,2,0,3,1,7,0,2,1,10,0,17,1,3,0,4,1,2,0,3,1,6,0};
        //System.out.println(CandidateCode.pixelValue(new int[]{8, 9}, matrix));
    }
}
