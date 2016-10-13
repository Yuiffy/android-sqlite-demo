# android-sqlite-demo
android sqlite demo sample, use sqlite in multi activity.
main activity can enter 2 activity: add Player activity/ show players activity.
in [add Player activity], can add player name, and show all players' name.
in [show players activity], can show all players.
use sqlite / sqliteDbHelper / ListView / ArrayAdapter.
is so simple, good to know it!
use sqlite, simplely, no multi-thread, though the android docs said "Note: Because they can be long-running, be sure that you call getWritableDatabase() or getReadableDatabase() in a background thread, such as with AsyncTask or IntentService."
