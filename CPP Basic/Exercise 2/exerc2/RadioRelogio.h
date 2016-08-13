#ifndef RADIORELOGIO_H
#define RADIORELOGIO_H

#include "Relogio.h"
#include "Radio.h"
#include <string>
#include <sstream>

class RadioRelogio : public Relogio, public Radio {

public:

    RadioRelogio(std::string ligado, std::string freq , double estacao ,int hora  ,int minuto);
    void SetarDespertador();
    void mostrarRR();
private:


};

#endif
