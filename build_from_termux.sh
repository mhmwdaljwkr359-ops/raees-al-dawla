#!/data/data/com.termux/files/usr/bin/bash
set -e
echo "👑 رئيس الدولة — تجهيز ورفع المشروع"
command -v gh >/dev/null || { echo "ثبت GitHub CLI: pkg install gh git"; exit 1; }
gh auth status >/dev/null 2>&1 || gh auth login
git init -b main
git add .
git commit -m "Initial release: Raees Al Dawla"
gh repo create raees-al-dawla --public --source=. --remote=origin --push
echo
echo "✅ تم رفع المشروع. افتح Actions في GitHub وانتظر بناء APK."
echo "عند اكتمال البناء حمّل artifact: raees-al-dawla-apk"
