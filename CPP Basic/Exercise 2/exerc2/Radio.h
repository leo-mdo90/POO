#ifndef RADIO_H
#define RADIO_H

#include<iostream>


class Radio {

public:

	Radio(std::string ligado = "OFF", std::string freq = "AM", double estacao = 1.0);
	std::string getligado();
    std::string getfreq();
	double getestacao();
	void setligado();
    void setfreq();
	void setestacaoup();
	void setestacaodown();


protected:
	std::string ligado ;
    std::string freq;
	double estacao;
	std::string toque;

};

#endif
