#include "Relogio.h"
#include "Radio.h"
#include "RadioRelogio.h"
#include <string>
#include <sstream>

using namespace std;

RadioRelogio::RadioRelogio(string ligado,string freq, double estacao,int hora ,int minuto)
{

    this->ligado = ligado;
    this->freq = freq;
    this->estacao = estacao;
    if(hora >= 0 && hora < 24 && minuto >= 0  && minuto < 60){
    this->hora = hora;
    this->minuto = minuto;
    }
    else
        {
            cout<< "valores invalidos";
            return;
        }
}

void RadioRelogio::SetarDespertador()
{
    int option;
    string toque = "Alabama";
    cout << "Opcao 1 para setar toque do alarme\n Opcao 2 para setar toque para ligar desligar" << endl;
    cin >> option;
    if(option == 1)
        {
            this->toque = toque;
        }
    if(option == 2)
        {
            this->toqueligar = toque;
        }
    else
        {
            cout << "opcao inexistente" << endl;
        }

}


void RadioRelogio::mostrarRR()
{
    cout << "Horario: " << this->hora << "horas e" << this->minuto << "minutos" << endl;
    cout << "O/I " << this->ligado << " Estacao " << this->estacao << " " << this->freq << endl;
    cout << "TOQUE Alarme" << this->toque << endl;
    cout << "TOQUE ligar" << this->toqueligar << endl;

}
