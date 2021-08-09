
#ifndef ENCA_NUMBER_H
#define ENCA_NUMBER_H

#include <cstdint>

class Number {

  public:
    Number() {}
    ~Number() {}

    enum Type {
      INT = 0,
      FLT,
    };

    template <typename T>
    void setValue(T val, Type t) {
      T* ptr = (T*) value;
      *ptr = val;
      type = t;
    }

    uint16_t getValue() {
      uint16_t* ptr = (uint16_t*) value;
      return *ptr;
    }

    uint8_t value[16];
    Type type;
};


#endif