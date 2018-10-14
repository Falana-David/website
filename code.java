const int out=12;
const int in=13;

void setup() {
  Serial.begin(9600);
  pinMode(out,OUTPUT);
  pinMode(in,INPUT);

}

void loop() 
  long dur;
  long dis;

  digitalWrite(out,LOW);
  delayMicroseconds(2);

  digitalWrite(out,HIGH);
  delayMicroseconds(10);
  digitalWrite(out,LOW);

  dur=pulseIn(in,HIGH);

  Serial.println(String(dur));

  delay(100);
}

/*
int EN2 = 14;  
int EN3 = 15;
int EN4 = 16;
int EN5 = 17;
int EA = 3;
int EB = 5;
int eEN3 = 3;
int N4E = 3;

void forward(void) {
  analogWrite(EA, 254); //speed 0 - 255
  analogWrite(EB, 255); //speed 0 - 255
  digitalWrite(EN2, LOW);
  digitalWrite(EN3, HIGH);
  digitalWrite(N4E, LOW);
  digitalWrite(EN5, HIGH);
}

void backward(void) {
  analogWrite(EA, 255); //speed 0 - 255
  analogWrite(EB, 255); //speed 0 - 255
  digitalWrite(EN2, HIGH);
  digitalWrite(EN3, LOW);
  digitalWrite(EN4, HIGH);
  digitalWrite(EN5, LOW);
}

void left(void) {
  analogWrite(EA, 180); //speed 0 - 255
  analogWrite(EB, 180); //speed 0 - 255
  digitalWrite(EN2, LOW);
  digitalWrite(EN3, HIGH);
  digitalWrite(EN4, HIGH);
  digitalWrite(EN5, LOW);
}

void right(void) {
  analogWrite(EA, 180); //speed 0 - 255
  analogWrite(EB, 180); //speed 0 - 255
  digitalWrite(EN2, HIGH);
  digitalWrite(EN3, LOW);
  digitalWrite(EN4, LOW);
  digitalWrite(EN5, HIGH);
}
*/
//basic moveing code
