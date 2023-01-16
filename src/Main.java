public class Main {
    public static void main(String[] args)
    {
        System.out.println(FirstLastDigitSum.SumFirstAndLastDigit(252));    //Expected result: 4
        System.out.println(FirstLastDigitSum.SumFirstAndLastDigit(257));    //Expected result: 9
        System.out.println(FirstLastDigitSum.SumFirstAndLastDigit(0));      //Expected result: 0
        System.out.println(FirstLastDigitSum.SumFirstAndLastDigit(5));      //Expected result: 10
        System.out.println(FirstLastDigitSum.SumFirstAndLastDigit(-10));    //Expected result: -1
    }

    public static class FirstLastDigitSum
    {
        public static int SumFirstAndLastDigit(int iNumber)
        {
            if (iNumber < 0) return -1;
            else
            {
                int iEnd = iNumber % 10;
                int iStart = iNumber;

                while (iStart > 10)
                {
                    iStart = iStart / 10;
                }
                    return iEnd + iStart;
            }
        }
    }
}