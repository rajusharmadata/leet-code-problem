/*
iven an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.*/

#include<iostream>
using namespace std;
int addDigit(int number){
   
while(number>9){

     int ans =0,rem;
     while(number!=0)
     {
    rem=number%10;
    number=number/10;
    ans = ans+rem;
       }
    number=ans;

}
return number;

}
int main(){
    int number,solution;
    cout<<"Enter number"<<endl;
    cin>>number;
   solution =addDigit(number);
   cout<<"ans is "<<solution;
   return 0;
}

