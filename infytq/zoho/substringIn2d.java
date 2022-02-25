package zoho;

public class substringIn2d {
    // Java implementation of the
// above approach
static int R, C;
 
// For searching in all 8 direction
static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

// This function searches in all
// 8-direction from point
// (row, col) in grid[][]
static boolean search2D(char[][] grid, int row,
                        int col, String word)
{
    System.out.println(word);
    //If first character of word
    // doesn't match with
    // given starting point in grid.
    if (grid[row][col] != word.charAt(0))
        return false;

    int len = word.length();

    // Search word in all 8 directions
    // starting from (row, col)
    for (int dir = 0; dir < 8; dir++) {
        // Initialize starting point
        // for current direction
        int k, rd = row + x[dir], cd = col + y[dir];

        // First character is already checked,
        // match remaining characters
        for (k = 1; k < len; k++) {
            // If out of bound break
            if (rd >= R || rd < 0 || cd >= C || cd < 0)
                break;

            // If not matched, break
            if (grid[rd][cd] != word.charAt(k))
                break;

            // Moving in particular direction
            rd += x[dir];
            cd += y[dir];
        }

        // If all character matched,
        // then value of must
        // be equal to length of word
        if (k == len)
            return true;
    }
    return false;
}

// Searches given word in a given
// matrix in all 8 directions
static void patternSearch(
    char[][] grid,
    String word)
{
   // System.out.println(word);
    // Consider every point as starting
    // point and search given word
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            if (grid[row][col]==word.charAt(0)  &&
                search2D(grid, row, col, word))
                    System.out.println(
                        "pattern found at " + row + ", " + col);
        }
    }
}


	// Function to string into grid form
	static void gridStr(String str)
	{
		int l = str.length();
		int k = 0, row, column;
		row = (int) Math.floor(Math.sqrt(l));
		column = (int) Math.ceil(Math.sqrt(l));

		if (row * column < l)
		{
			row = column;
		}

		char s[][] = new char[row][column];
		
		// convert the string into grid
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				if(k < str.length())
					s[i][j] = str.charAt(k);
				k++;
			}
		}

		// Printing the grid
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				if (s[i][j] == 0)
				{
					break;
				}
				System.out.print(s[i][j]);
			}
			System.out.println("");
		}
        patternSearch(s, "WELCO");
        System.out.println();
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "WELCOMETOZOHOCORPORATION";
		gridStr(str);
	}
}

//This code is contributed by Rajput-Ji


