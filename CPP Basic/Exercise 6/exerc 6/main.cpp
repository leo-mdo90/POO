#include <iostream>
#include <vector>
#include <string>
#include <stdlib.h>

using namespace std;

class complx
{
private:
    double real, imag;
public:
    complx(double real = 0.,
           double imag = 0.);
    complx operator+(const complx&) const;
    complx operator+=(complx&);
    complx operator-(const complx&) const;
    complx operator*(const complx&) const;
    void print();
    void mod();
};

complx::complx(double r, double i)
{
    real = r;
    imag = i;
}

complx complx::operator+ (const complx& c) const
{
    complx result;
    result.real = (this->real + c.real);
    result.imag = (this->imag + c.imag);
    return result;
}

complx complx::operator+= (complx& result)
{
    this->real= this->real + result.real;
    this->imag= this->imag + result.imag;
    return *this;
}

complx complx::operator- (const complx& c) const
{
    complx result;
    result.real = (this->real - c.real);
    result.imag = (this->imag - c.imag);
    return result;
}

complx complx::operator* (const complx& c) const
{
    complx result;
    result.real = (this->real*c.real) + (this->imag*c.imag);
    result.imag = (this->real*c.imag) + (this->imag*c.real);
    return result;
}

void complx::mod()
{
    if(this->real< 0)
    {
        this->real = (-1)*this->real;
    }
    if(this->imag< 0)
    {
        this->imag = (-1)*this->imag;
    }
}

void complx::print()
{
    if(imag > 0)
        cout << real << "+" << imag << "*i"<< endl;
    else
        cout << real << imag << "*i"<< endl;
}

int main()
{
    int n;
    cin >> n;
    complx result(0,0);
    vector<complx> SS;

    for(int i=0; i<n ; i++)
    {
        int x = rand () % 100;
        int y = rand () % 100;
        complx num(x,y);
        SS.push_back(num);
    }


    for(std::vector<complx>::iterator cii = SS.begin(); cii!=SS.end(); cii++)
    {
        result+= *cii;
    }


    result.print();



}
