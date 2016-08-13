#include <iostream>

using namespace std;

class Inserir
{
    public:
        Inserir(){}
        int correto(int n) const
        {
            this->n = n + 1;
            cout << n;
            return this->n;

        }
    protected:
        int n;
    private:
};


int main()
{
     Inserir i;
     i.correto(1);
    return 0;
}
