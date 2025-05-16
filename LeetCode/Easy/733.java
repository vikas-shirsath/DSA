class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if(originalColor == color) { return image;}

        dfs(image, sr, sc, originalColor, color);
        
        return image;
    }

    public int[][] dfs(int[][] image, int sr, int sc, int originalColor, int color) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) { return image;}

        if(image[sr][sc] != originalColor) { return image; }

        image[sr][sc] = color;

        dfs(image, sr + 1, sc, originalColor, color);
        dfs(image, sr - 1, sc, originalColor, color);
        dfs(image, sr, sc + 1, originalColor, color);
        dfs(image, sr, sc - 1, originalColor, color);

        return image;
    }
}