package inteface;

import package.Inter;

class Rectangle implements Shape{
    int l = 6, b = 4;
    double ar;
    
    public void area()
    {
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}

class Square implements Shape{
    int l = 4, b = 4;
    double ar;
    
    public void area()
    {
        ar = l * b;
        System.out.println("Area of square:"+ar);
    }
}

class Circle implements Shape{
    int r = 5;
    double pi = 3.14, ar = 0;
    
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}