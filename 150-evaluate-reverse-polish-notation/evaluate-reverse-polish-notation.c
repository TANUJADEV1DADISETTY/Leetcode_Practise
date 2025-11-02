int evalRPN(char** tokens, int tokensSize) {
    int st[10001];//stack of integers
	int top=-1,i;
	for(i=0;i<tokensSize;i++)
	{
         char ch = tokens[i][0];
         int size = strlen(tokens[i]);
	      if(size==1&&( ch=='+'||ch=='-'||ch=='*'||ch=='/'))
		  { 
		    
		  	 int op2 = st[top--];//1st pop operation(value 1)
		  	 int op1 = st[top--];//2nd pop operation(value 2)
		  	 int res;
			 if(ch=='+')
			 {
			 	res=op1+op2;
			 }
			 else if(ch=='-')
			 {
			 	res=op1-op2;
			 }
			 else if(ch=='*')
			 {
			 	res=op1*op2;
			 }
			 else if(ch=='/')
			 {
			 	res=op1/op2;
			 }
			 st[++top]=res;//pushing result into stack
		  }
          else
          {
            st[++top]=atoi(tokens[i]);
          }
	}
	return st[top];
}
