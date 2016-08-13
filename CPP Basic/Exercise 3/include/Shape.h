#ifndef SHAPE_H
#define SHAPE_H


class Polinomio
{
    public:
        virtual void setLargura(int w);
        virtual void setAltura(int h);
    protected:
        int lagura;
        int altura;

};

#endif // SHAPE_H
