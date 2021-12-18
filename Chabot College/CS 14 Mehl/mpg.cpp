//
// mpg.cpp
//
// Kayvaun Khoshkhou Brock Hardy
// 1/25/18
// to calculate the number of miles per tank of gasoline
// Calculates the mpg of a tank of gas
//

#include <iostream>
using namespace std;

int main ()
{
    // to hold user values and results of data
    float beginning, ending, gallons, distance, MPG;
    cout << "Beginning Odometer Reading: " << flush;
    cin >> beginning;
    cout << "Ending Odometer Reading: " << flush;
    cin >> ending;
    // calculate total distance driven
    distance = ending - beginning;
    cout << "The distance traveled is " << distance << endl;
    cout << "Number of Gallons needed to fill up: ";
    cin >> gallons;
    // calculate total miles per gallon
    MPG = distance / gallons;
    cout << "MPG is: " << MPG << endl;
    return 0;
}
