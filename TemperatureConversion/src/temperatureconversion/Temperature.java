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

/**
 * Temperature conversion class
 * @author dystopiancode
 */
public class Temperature
{
    /**
     * Member holds the temperature in Kelvin degrees
     */
    private double degreesKelvin;
    
    /**
     * Private constructor used by static factory methods
     * @param degrees Kelvin degrees
     */
    private Temperature(double degrees)
    {
        this.degreesKelvin = degrees;
    }
    /**
     * Creates a Temperature object
     * @param degrees Celsius degrees
     * @return A temperature object
     */
    public static Temperature fromCelsius(double degrees)
    {
        return new Temperature(degrees+273.15);
    }
    /**
     * Creates a Temperature object
     * @param degrees Kelvin degrees
     * @return A temperature object
     */
    public static Temperature fromKelvin(double degrees)
    {
        return new Temperature(degrees);
    }
    /**
     * Creates a Temperature object
     * @param degrees Rankine degrees
     * @return A temperature object
     */
    public static Temperature fromRankine(double degrees)
    {
        return new Temperature(5.0*degrees/9.0);
    }
    /**
     * Creates a Temperature object
     * @param degrees Delisle degrees
     * @return A temperature object
     */
    public static Temperature fromDelisle(double degrees)
    {
        return new Temperature(2.0*(373.15-degrees)/3.0);
    }
    /**
     * Creates a Temperature object
     * @param degrees Newton degrees
     * @return A temperature object
     */
    public static Temperature fromNewton(double degrees)
    {
        return new Temperature(100.0*degrees/33.0 + 273.15);
    }
    /**
     * Creates a Temperature object
     * @param degrees Reaumur degrees
     * @return A temperature object
     */
    public static Temperature fromReaumur(double degrees)
    {
        return new Temperature(5.0*degrees/4.0 + 273.15);
    }
    /**
     * Creates a Temperature object
     * @param degrees Romer degrees
     * @return A temperature object
     */
    public static Temperature fromRomer(double degrees)
    {
        return new Temperature(40*(degrees-7.5)/21 + 273.15);
    }
    /**
     * Creates a Temperature object
     * @param degrees Fahrenheit degrees
     * @return A temperature object
     */
    public static Temperature fromFahrenheit(double degrees)
    {
        return new Temperature(5*(degrees-459.67)/9);
    }
    /**
     * Returns the current temperature in Kelvin degrees
     * @return Kelvin degrees
     */
    public double toKelvin()
    {
        return this.degreesKelvin;
    }
    /**
     * Returns the current temperature in Celsius degrees
     * @return Celsius degrees
     */
    public double toCelsius()
    {
        return this.degreesKelvin - 273.15;
    }
    /**
     * Returns the current temperature in Rankine degrees
     * @return Rankine degrees
     */
    public double toRankine()
    {
        return 9.0*this.degreesKelvin/5.0;
    }
    /**
     * Returns the current temperature in Delisle degrees
     * @return Delisle degrees
     */
    public double toDelisle()
    {
        return 3.0*(373.15 - this.degreesKelvin)/2.0;
    }
    /**
     * Returns the current temperature in Newton degrees
     * @return Newton degrees
     */
    public double toNewton()
    {
        return 33.0*(this.degreesKelvin - 273.15)/100.0;
    }
    /**
     * Returns the current temperature in Reaumur degrees
     * @return Reaumur degrees
     */
    public double toReaumur()
    {
        return 4.0*(this.degreesKelvin - 273.15)/5.0;
    }
    /**
     * Returns the current temperature in Romer degrees
     * @return Romer degrees
     */
    public double toRomer()
    {
        return 21.0*(this.degreesKelvin - 273.15)/40.0 + 7.5;
    }
    /**
     * Returns the current temperature in Fahrenheit degrees
     * @return Fahrenheit degrees
     */
    public double toFahrenheit()
    {
        return 5.0*(this.degreesKelvin)/9.0 -459.67;
    }
}
