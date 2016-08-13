#include "Radio.h"
#include <string>
#include <sstream>

using namespace std;

Radio::Radio(string ligado, string freq, double estacao)
{
    this->ligado = ligado;
    this->freq = freq;
    this->estacao = estacao;
}

string Radio::getligado()
{
    return ligado;
}

void Radio::setligado()
{
    if(this->ligado == "OFF")
    {
        this->ligado = "ON";
    }
    else
        this->ligado = "OFF";
}

string Radio::getfreq()
{
    return freq;
}

void Radio::setfreq()
{
    if(this->freq == "AM")
        this->freq = "FM";
    else
        this->freq = "AM";

}

double Radio::getestacao()
{
    return estacao;
}

void Radio::setestacaoup()
{

    this->estacao += 0.1;
}

void Radio::setestacaodown()
{

    this->estacao -= 0.1;
}
