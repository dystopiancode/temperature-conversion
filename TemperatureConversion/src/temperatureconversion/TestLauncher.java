/******************************************************************************
Copyright (c) 2012, DystopianCode
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of the DystopianCode nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL DystopianCode BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*******************************************************************************/
package temperatureconversion;

public class TestLauncher
{
    public static void main(String[] args)
    {
        Temperature t1 = Temperature.fromCelsius(-273.15);
        Temperature t2 = Temperature.fromKelvin(0.0);
        System.out.println("Kelvin degrees    : " + t1.toKelvin()     +"\n" +
                           "Celsius degrees   : " + t1.toCelsius()    +"\n" +
                           "Delisle degrees   : " + t1.toDelisle()    +"\n" +
                           "Newton degrees    : " + t1.toNewton()     +"\n" +
                           "Rankine degrees   : " + t1.toRankine()    +"\n" +
                           "Reaumur degrees   : " + t1.toReaumur()    +"\n" +
                           "Fahrenheit degrees: " + t1.toFahrenheit() +"\n" +
                           "Romer degrees     : " + t1.toRomer()      +"\n" );
        System.out.println("Kelvin degrees    : " + t2.toKelvin()     +"\n" +
                           "Celsius degrees   : " + t2.toCelsius()    +"\n" +
                           "Delisle degrees   : " + t2.toDelisle()    +"\n" +
                           "Newton degrees    : " + t2.toNewton()     +"\n" +
                           "Rankine degrees   : " + t2.toRankine()    +"\n" +
                           "Reaumur degrees   : " + t2.toReaumur()    +"\n" +
                           "Fahrenheit degrees: " + t2.toFahrenheit() +"\n" +
                           "Romer degrees     : " + t2.toRomer()      +"\n" );
    }
}
