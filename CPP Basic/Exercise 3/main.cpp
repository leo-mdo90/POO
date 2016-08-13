#include <iostream>

using namespace std;

class Polinomio
{
    public:
        void setLargura(int l)
        {
            largura = l;
        }
        void setAltura(int a)
        {
            altura = a;
        }
        virtual void Area()
        {
            cout << "Aqui se calcula a area" << endl;
        }
    protected:
        int largura;
        int altura;

};

class Quadrado : public Polinomio
{
public:

    void Area()
    {
        int A = largura*altura;
        cout << "Area " << A << endl;
    }
};

class Triangulo : public Polinomio
{
public:

    void Area()
    {
        int A = (int)(largura*altura)/2;
        cout << "Area " << A << endl;
    }
};

int main()
{
    Polinomio *p;
    Quadrado q;
    Triangulo t;
    q.setAltura(2);
    q.setLargura(2);
    //calcular quadrado
    p = &q;
    p->Area();
    //calcula triangulo
    t.setAltura(2);
    t.setLargura(3);
    p = &t;
    p->Area();


    return 0;
}
