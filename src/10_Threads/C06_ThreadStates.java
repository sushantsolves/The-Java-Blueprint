/*
==============================================
            STATES IN THREAD
==============================================

-> new  - start()
-> Runnable - start(), or notify() [from waiting]
-> running - run()
-> waiting - sleep(), wait()
-> Dead - stop()

*/