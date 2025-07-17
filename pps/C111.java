package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C111 {
    static int[] tiles=new int[1000001];
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<tiles.length;i++){
            tiles[i]=-1;
        }

        tiles[0]=0;
        tiles[1]=1;
        tiles[2]=2;

        System.out.println(tile(n));
    }
    private static int tile(int n){
        if(tiles[n]!=-1){
            return tiles[n];
        }
        tiles[n]=(tile(n-1)+tile(n-2))%15746;

        return tiles[n];
    }
}
