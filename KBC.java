import java.util.*;
class KBC
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("              Welcome to Kaun Banega Crorepati!!           ");
        System.out.println("Rules for the game:");
        System.out.println("1)You get 10 points for every correct answer.");
        System.out.println("2)There are total 5 Questions.");
        System.out.println("3)If you answer less than 3 questions correctly than you will lose all the points.");
        System.out.println("4)You will be given 3 lifelines for the help.");
        System.out.println("So Lets Start The Game.");
        boolean flag=true;
        int Points=0;
        String a[]={"What is the capital of India?","Who is the current Prime Minister of India?","What is the capital of USA?","What is the capital of Gujarat?","Who is the richest man of India?"};
        ArrayList<String> lifeline=new ArrayList<String>();
        lifeline.add("1)Audience Poll");
        lifeline.add("2)Ask the expert");
        lifeline.add("3)50:50");
        int i=0;
        while(flag && i<a.length)
        {
            System.out.println(a[i]);
            if(i==0)
            {
                System.out.println("a)Delhi  b)Shangai  c)Mumbai  d)Gandhinagar");
                String ans=sc.nextLine();
                if(ans.equalsIgnoreCase("Delhi")||ans.equalsIgnoreCase("a"))
                {
                    Points+=10;
                }
                else if(ans.equalsIgnoreCase("lifeline"))
                {
                    for(String x:lifeline)
                    {
                        System.out.println(x);
                    }
                    String selectLifeline=sc.nextLine();
                    if(selectLifeline.equalsIgnoreCase("Audience Poll")||selectLifeline.equalsIgnoreCase("1"))
                    {
                        System.out.println("a)92%  b)1%  c)5%  d)2%");
                        lifeline.remove("1)Audience Poll");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Delhi")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else if(selectLifeline.equalsIgnoreCase("Ask the expert")||selectLifeline.equalsIgnoreCase("2"))
                    {
                        System.out.println("a)Delhi");
                        lifeline.remove("2)Ask the expert");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Delhi")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else
                    {
                        System.out.println("a)Delhi  c)Mumbai");
                        lifeline.remove("3)50:50");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Delhi")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                else
                {
                    flag=false;
                }
            }
            else if(i==1)
            {
                System.out.println("a)Manmohan Singh  b)Narendra Modi  c)Atal Bihari Vajpayee  d)Yogi Adityanath");
                String ans=sc.nextLine();
                if(ans.equalsIgnoreCase("Narendra Modi")||ans.equalsIgnoreCase("b"))
                {
                    Points+=10;
                }
                else if(ans.equalsIgnoreCase("lifeline"))
                {
                    for(String x:lifeline)
                    {
                        System.out.println(x);
                    }
                    String selectLifeline=sc.nextLine();
                    if(selectLifeline.equalsIgnoreCase("Audience Poll")||selectLifeline.equalsIgnoreCase("1"))
                    {
                        System.out.println("a)1%  b)92%  c)2%  d)5%");
                        lifeline.remove("1)Audience Poll");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Narendra Modi")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else if(selectLifeline.equalsIgnoreCase("Ask the expert")||selectLifeline.equalsIgnoreCase("2"))
                    {
                        System.out.println("b)Narendra Modi");
                        lifeline.remove("2)Ask the expert");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Narendra Modi")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else
                    {
                        System.out.println("b)Narendra Modi  d)Yogi Adityanath");
                        lifeline.remove("3)50:50");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Narendra Modi")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                else
                {
                    flag=false;
                }
            }
            else if(i==2)
            {
                System.out.println("a)Virginia  b)Washington D.C  c)New York  d)California");
                String ans=sc.nextLine();
                if(ans.equalsIgnoreCase("Washington D.C")||ans.equalsIgnoreCase("b"))
                {
                    Points+=10;
                }
                else if(ans.equalsIgnoreCase("lifeline"))
                {
                    for(String x:lifeline)
                    {
                        System.out.println(x);
                    }
                    String selectLifeline=sc.nextLine();
                    if(selectLifeline.equalsIgnoreCase("Audience Poll")||selectLifeline.equalsIgnoreCase("1"))
                    {
                        System.out.println("a)43%  b)50%  c)4%  d)3%");
                        lifeline.remove("1)Audience Poll");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Washington D.C")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else if(selectLifeline.equalsIgnoreCase("Ask the expert")||selectLifeline.equalsIgnoreCase("2"))
                    {
                        System.out.println("b)Washington D.C");
                        lifeline.remove("2)Ask the expert");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Washington D.C")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else
                    {
                        System.out.println("b)Washington D.C  d)California");
                        lifeline.remove("3)50:50");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Washington D.C")||ans.equalsIgnoreCase("b"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                else
                {
                    flag=false;
                }
            }
            else if(i==3)
            {
                System.out.println("a)Gandhinagar  b)Bhopal  c)Jaipur  d)Ahmedabad");
                String ans=sc.nextLine();
                if(ans.equalsIgnoreCase("Gandhinagar")||ans.equalsIgnoreCase("a"))
                {
                    Points+=10;
                }
                else if(ans.equalsIgnoreCase("lifeline"))
                {
                    for(String x:lifeline)
                    {
                        System.out.println(x);
                    }
                    String selectLifeline=sc.nextLine();
                    if(selectLifeline.equalsIgnoreCase("Audience Poll")||selectLifeline.equalsIgnoreCase("1"))
                    {
                        System.out.println("a)60%  b)20%  c)10%  d)10%");
                        lifeline.remove("1)Audience Poll");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Gandhinagar")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else if(selectLifeline.equalsIgnoreCase("Ask the expert")||selectLifeline.equalsIgnoreCase("2"))
                    {
                        System.out.println("a)Gandhinagar");
                        lifeline.remove("2)Ask the expert");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Gandhinagar")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else
                    {
                        System.out.println("a)Gandhinagar  b)Bhopal");
                        lifeline.remove("3)50:50");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Gandhinagar")||ans.equalsIgnoreCase("a"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                else
                {
                    flag=false;
                }
            }
            else if(i==4)
            {
                System.out.println("a)Ratan Tata  b)Azim Premji  c)Gautam Adani  d)Mukesh Ambani");
                String ans=sc.nextLine();
                if(ans.equalsIgnoreCase("Mukesh Ambani")||ans.equalsIgnoreCase("d"))
                {
                    Points+=10;
                }
                else if(ans.equalsIgnoreCase("lifeline"))
                {
                    for(String x:lifeline)
                    {
                        System.out.println(x);
                    }
                    String selectLifeline=sc.nextLine();
                    if(selectLifeline.equalsIgnoreCase("Audience Poll")||selectLifeline.equalsIgnoreCase("1"))
                    {
                        System.out.println("a)10%  b)5%  c)35%  d)50%");
                        lifeline.remove("1)Audience Poll");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Mukesh Ambani")||ans.equalsIgnoreCase("d"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else if(selectLifeline.equalsIgnoreCase("Ask the expert")||selectLifeline.equalsIgnoreCase("2"))
                    {
                        System.out.println("d)Mukesh Ambani");
                        lifeline.remove("2)Ask the expert");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Mukesh Ambani")||ans.equalsIgnoreCase("d"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                    else
                    {
                        System.out.println("c)Gautam Adani  d)Mukesh Ambani");
                        lifeline.remove("3)50:50");
                        ans=sc.nextLine();
                        if(ans.equalsIgnoreCase("Mukesh Ambani")||ans.equalsIgnoreCase("d"))
                        {
                            Points+=10;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                else
                {
                    flag=false;
                }
            }
            if(!flag)
            {
                System.out.println("Sorry,Wrong Answer...The game ends");
                if(Points>20)
                {
                    System.out.println("Your total points are = "+Points);
                }
                else
                {
                    System.out.println("Your total points are = "+0);
                }
            }
            if(i==4 && flag)
            {
                System.out.println("Congratulations You Finished the game...");
                System.out.println("Your total points are = "+Points);
            }
           i++;
        }
    }
}
