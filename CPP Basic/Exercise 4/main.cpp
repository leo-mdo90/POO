#include <iostream>

using namespace std;

class contador
{
    public:
        contador(string n)
        {
            nome = new string(n);
            cout << "Criou objeto" << endl;
        }
        ~contador()
        {
            delete nome;
            cout << "Destruiu objeto" << endl;
        }
    protected:
        string *nome;
    private:
};

int main()
{
    contador *c = new contador("Jonas");
    delete c;
    return 0;
}
