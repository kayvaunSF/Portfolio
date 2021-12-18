// Assignment3PartC.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <vector>
#include <fstream>
#include <string>
#include <sstream>
using namespace std;

vector<string> loadData() {

    vector<string> Data;

    // variables to manipulate .txt file with.
    string str;
    fstream inFile;

    // the next 3 lines open the file, get the contents, and put it into the Data vector.
    inFile.open("Data.CS.SFSU.txt", ios::in);
    while (getline(inFile, str)) {
        cout << str << endl;
    }

    // Closing the file
    inFile.close();

    return Data;
}

//// prints data from .txt file
//void printData() {
//    
//    // make vector to store file contents in.        
//    vector<string> Data;
//    
//    // variables to manipulate .txt file with.
//    string str;
//    fstream inFile;
//
//    // the next 3 lines open the file, get the contents, and put it into the Data vector.
//    inFile.open("Data.CS.SFSU.txt", ios::in);
//    while (getline(inFile, str)) {
//        cout << str << endl;
//    }
//    
//    // this for-loop prints out the contents of the vector. 
//    for (int i = 0; i < Data.size(); i++) {
//        cout << Data[i] << endl;
//    }
//    
//    // Closing the file
//    inFile.close();
//
//}

string vecToString(vector<string> updateData) {
    stringstream ss;

    for (vector<string>::const_iterator itr = updateData.begin();
        itr != updateData.end();
        ++itr) {
        ss << *itr;
    }

    return ss.str();
}


// Method to parse the contents by '|' but not complete
// Also return method to put back in main
vector<string> parseData() {

    vector<string> info = loadData();

    string test = vecToString(loadData());
    string delimiter = "|";

    size_t pos = 0;
    string token;

    while ((pos = test.find(delimiter)) != string::npos) {
        token = test.substr(0, pos);
        cout << token << endl;
        test.erase(0, pos + delimiter.length());
    }

    cout << test << endl;

    /* for (int i = 0; i < test.size(); i++) {
         cout << test[i] << endl;
     }*/


     //vector<string> updateData();
    return info;
}



// this generic error method is used for when user input is incorrect
void errorMessage() {
    cout << "|" << endl;
    cout << " PARAMETER HOW-TO, please enter" << endl;
    cout << " 1. A search key -then 2. An optional part of speech -then" << endl;
    cout << " 3. An optional 'distinct' -then 4. An optional 'reverse'" << endl;
    cout << "|" << endl;
}


int main()
{
    // TO-DO: Use this in methods
    vector<string> updateData;

    // Function call check
    // printData();
    // loadData();
    parseData();

    // Instantiating these variables as global to keep track
    // of searches + do-while loops
    int whileLoop = 0;
    string userInput;
    int currentSearch = 1;
    int big = 0;

    // Generic opening + Keywords/Definitions in vector
    cout << "==== Dictionary 340 C++ ====" << endl;
    cout << "------ Keywords: " /* << keyWord variable */ << endl;
    cout << "------ Definitions: " /* << definitionVariable */ << endl;

    // This is the user interface

    do {
        do {
            cout << "Search [" << currentSearch << "]: ";
            cin >> userInput;

        } while (whileLoop == 0);

    } while (big == 0);

    return 0;

}


