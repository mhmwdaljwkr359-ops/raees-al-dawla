# رئيس الدولة — Android starter project

المطور: حودا التــــــــركي
التواصل: +201044902095

## ما الموجود؟
- تطبيق Android WebView باسم رئيس الدولة وأيقونة مخصصة.
- لعبة استراتيجية أولية تعمل محلياً: اختيار دولة، اقتصاد، جيش، دبلوماسية، أحداث، حفظ محلي.
- لوحة فنية مولّدة مرفقة كشاشة غلاف داخل اللعبة.
- إعداد GitHub Actions لبناء APK تلقائياً.

## تنبيه صريح
هذه نسخة أولية قابلة للعب وليست محاكاة جيوسياسية واقعية مكتملة. قائمة الدول للاختيار، لكن حدود الدول التفاعلية، بيانات السكان/الاقتصاد الموثقة، الذكاء الاصطناعي المتقدم، والقتال التفصيلي تحتاج مراحل تطوير إضافية. لا توجد اتصالات بخدمات خارجية أو جمع بيانات.

## بناء APK من Termux
1. ثبت Termux من مصدر موثوق، ثم:
   pkg update -y && pkg install git gh -y
2. سجّل الدخول إلى GitHub:
   gh auth login
3. فك ضغط المشروع ثم ادخل مجلده:
   mkdir -p ~/raees_al_dawla && cd ~/raees_al_dawla
   unzip ~/storage/downloads/Raees-Al-Dawla-Termux.zip
4. أنشئ مستودعاً وارفع الملفات:
   gh repo create raees-al-dawla --public --source=. --remote=origin --push
5. افتح Actions في مستودع GitHub وانتظر انتهاء Build Android APK.
6. من صفحة Actions افتح أحدث تشغيل وحمّل artifact باسم raees-al-dawla-apk.
7. فك الضغط وثبّت app-debug.apk على هاتفك. قد يطلب Android السماح بالتثبيت من هذا المصدر.

## ملاحظة
بناء Android APK مباشرة داخل Termux على الهاتف ليس مساراً مدعوماً وموثوقاً بسبب أدوات Android SDK؛ لذلك يستخدم المشروع GitHub Actions لبناء APK في بيئة Android/Linux رسمية، بينما تتم إدارة الملفات ورفعها من Termux.
