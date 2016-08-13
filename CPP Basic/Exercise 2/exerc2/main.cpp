#include "Radio.h"
#include "Relogio.h"
#include "RadioRelogio.h"
#include <iostream>

using namespace std;

int main()
{
    Radio r("OFF","AM",95.7);
    Relogio t(12,00);
    //t.setAlarme();
    //t.sethora();
    //t.mostrar();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setligado();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setfreq();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setfreq();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setfreq();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setestacaoup();
    //r.setestacaoup();
    //r.setestacaoup();
    //r.setestacaoup();
    //r.setestacaoup();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    //r.setestacaodown();
    //r.setestacaodown();
    //r.setestacaodown();
    //cout << "O/I " << r.getligado() << " Estacao " << r.getestacao() << " " << r.getfreq() << endl;
    RadioRelogio T("OFF","AM",95.7,12,00);
    T.SetarDespertador();
    T.mostrarRR();

    return 0;
}
