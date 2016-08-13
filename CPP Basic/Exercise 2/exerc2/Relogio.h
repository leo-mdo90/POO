#ifndef RELOGIO_H
#define RELOGIO_H

#include<iostream>


class Relogio {

public:

	Relogio(int hora = 12 ,int minuto = 00);

	int gethora();
	int getminuto();
	void sethora();
	void setAlarme();
	void mostrar();


protected:
	int hora;
	int minuto;
	int alarmeh;
	int alarmem;
	std::string toqueligar;

};

#endif
