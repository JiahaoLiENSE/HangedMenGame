package HangedMenGame;

public class Guess {

    public boolean isContaisChar(char[] array, char c)
{
    boolean correctGuess = false;

    for(int i = 0; i<array.length; i++)
    {
        if(array[i] == c)
        {
            correctGuess = true;
            break;
        }
    }

    return correctGuess;
}

}
