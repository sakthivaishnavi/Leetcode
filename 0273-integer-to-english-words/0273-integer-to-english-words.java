class Solution {
    
     String tens[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String belowTwenty[] ={"","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    public String numberToWords(int num) {
        if(num==0)
        return "Zero";
        return convert(num);           
    }

    private String convert(int num)
    {
        StringBuilder res = new StringBuilder();
        if(num<20)
        {
            res.append(belowTwenty[num]);
        }
        else if(num<100)
        {
            res.append(tens[num/10]).append(" ").append(belowTwenty[num%10]);
        }
        else if(num<1000)
        {
            res.append(convert(num/100)).append(" Hundred ").append(convert(num%100));
        }
        else if(num<1000000)
        {
            res.append(convert(num/1000)).append(" Thousand ").append(convert(num%1000));
        }
        else if(num<1000000000)
        {
            res.append(convert(num/1000000)).append(" Million ").append(convert(num%1000000));
        }
        else
        {
            res.append(convert(num/1000000000)).append(" Billion " ).append(convert(num%1000000000));
        }
        return res.toString().trim();
    }
}