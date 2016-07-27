#pragma once

#include "value.hpp"
#include "../java_types.hpp"

#include <mbgl/platform/log.hpp>
//#include <mbgl/util/feature.hpp>
#include <mbgl/util/optional.hpp>

//#include <mapbox/geometry/feature.hpp>

#include <jni/jni.hpp>

//XXX
#pragma GCC diagnostic ignored "-Wunused-parameter"

namespace mbgl {
namespace geometry {
namespace feature {

class PropertyValueEvaluator  {


public:

    PropertyValueEvaluator(jni::JNIEnv&);
    virtual ~PropertyValueEvaluator();

    std::nullptr_t operator()(const std::nullptr_t &property) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: returning null");
        return nullptr;
    }

    jboolean operator()(const bool &property) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: converting bool to jboolean");
        return value ? JNI_TRUE : JNI_FALSE;
    }

    jlong operator()(const uint64_t &property) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: converting uint64_t to jlong");
        return static_cast<jlong>(property);
    }

    jint operator()(const int64_t &property) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: converting int64_t to jint");
        return property;
    }

    jdouble operator()(const double &property) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: converting double to jdouble");
        return property;
    }

    jni::jstring* operator()(const std::string &property) const {
       mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator: converting std::string to jstring");
       return jni::Make<jni::String>(jenv, property).Get();
    }

    jobject operator()(const std::vector<mbgl::Value> &values) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator not implemented for list");
        // create java list
        //for (const auto &v : values) {
            // add item to list while visiting this to evaluate its properties
            //[objects addObject:mbgl::Value::visit(v, *this)];
        //}
        // change return with list
        return nullptr;
    }

    jobject operator()(const std::unordered_map<std::string, mbgl::Value> &items) const {
        mbgl::Log::Warning(mbgl::Event::Android, "PropertyEvaluator not implemented for map");
        // create java map
        //for (auto &item : items) {
            // add item to map while recursively visiting its properties
            //attributes[@(item.first.c_str())] = mbgl::Value::visit(item.second, *this);
        //}
        return nullptr;
    }

    jni::JNIEnv& jenv;
    jni::jobject* value;
};

}
} // namespace geometry
} // namespace mbgl