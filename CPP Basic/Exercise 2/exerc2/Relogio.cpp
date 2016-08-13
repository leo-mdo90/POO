#include "Relogio.h"
#include <string>
#include <sstream>

using namespace std;

Relogio::Relogio(int hora, int minuto)
{
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

int Relogio::gethora()
{
    return hora;
}

int Relogio::getminuto()
{
    return minuto;
}

void Relogio::sethora()
{
    int minute;
    int hour;
    cout << "Coloque a hora do relogio" << endl;
    cin >> hour;
    cout << "Coloque o minuto do alarme" << endl;
    cin >> minute;
    if(hour >= 0 && hour < 24 && minute >= 0  && minute < 60){
    this->minuto = minute;
    this->hora = hour;
    }
    else
        {
            cout<< "valores invalidos" << endl;
            return;
        }
}

void Relogio::setAlarme()
{
    int minute;
    int hour;
    cout << "Coloque a hora do alame" << endl;
    cin >> hour;
    cout << "Coloque o minuto do alarme" << endl;
    cin >> minute;
    if(hour >= 0 && hour < 24 && minute >= 0  && minute < 60){
    this->alarmem = minute;
    this->alarmeh = hour;
    }
     else
        {
            cout<< "valores invalidos" << endl ;
            return;
        }
}

void Relogio::mostrar()
{
    cout << "Horario: " << this->hora << "horas e" << this->minuto << "minutos" << endl;
}

