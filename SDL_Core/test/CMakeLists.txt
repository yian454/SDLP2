find_package(Gstreamer-1.0 REQUIRED)
find_package(Glib-2.0 REQUIRED)

# --- GoogleTest example
#add_subdirectory(./gtest-example)

# --- components tests
add_subdirectory(./components)
add_subdirectory(./thirdPartyLibs)

include_directories (
  ../src/thirdPartyLibs/gmock-1.6.0/include
  ../src/components/formatters/include
  ../src/thirdPartyLibs/gmock-1.6.0/gtest/include
  ../src/components/application_manager/include
  ../src/components/mobile_message_handler/include
  ../src/components/request_watchdog/include
  ../src/components/audio_manager/include
  ../src/components/protocol_handler/include
  ../src/components/transport_manager/include
  ../src/components/connection_handler/include
  ../src/components/formatters/include
  ../src/components/smart_objects/include
  ../src/thirdPartyLibs/jsoncpp/include/
  ../src/thirdPartyLibs/logger/include/
  ../src/components/utils/include/
  ../test/components/mobile_message_handler/include/
  ../test/components/request_watchdog/include/
  ../test/components/audio_manager/include
  ../test/components/protocol_handler/include/
  ../test/components/utils/include
  ../test/components/json_handler/include
  ../test/components/smart_objects
  ../test/components/transport_manager
  ../test/components/
  ../test/thirdPartyLibs/jsoncpp/include
  ../test/components/application_manager
  ${CMAKE_BINARY_DIR}/src/components/
  ${CMAKE_BINARY_DIR}
  /usr/lib/i386-linux-gnu/glib-2.0/include
  /usr/lib/x86_64-linux-gnu/glib-2.0/include/
  ${GSTREAMER_gst_INCLUDE_DIR}
  ${GLIB_glib_2_INCLUDE_DIR}
)

set(LIBRARIES
    gtest
    gtest_main
    gmock
    gmock_main
    RequestWatchdog
    AudioManager
    formatters
    HMI_API
    SmartObjects
    ApplicationManager
    MobileMessageHandler
    ProtocolHandler
    Utils
    ConfigProfile
    #test_JSONHandler_v4_protocol_v2_0_revP
    #test_JSONHandlerTest
    test_SmartObjectTest
    test_FormattersCommandsTest
    test_UtilsTest
    test_RequestWatchdogTest
    test_ProtocolHandlerTest
    test_JSONCPPTest
    #test_MobileMessageHandlerTest
    MOBILE_API
    jsoncpp
    rt
    ${GSTREAMER_gstreamer_LIBRARY}
)

add_executable("test_suit" "./test_suit.cc")
target_link_libraries("test_suit" ${LIBRARIES})

