package com.example.reminderfragment

import android.content.Context

/**
 * create a repository class which is responsible for using the DAO to make operations
 * on the database. This prevents us from having to create and initialize the dao objects
 * in the activity classes using the getDatabase method all the time. We just need to
 * create a repository class now.
 */

public class ReminderRepository(context: Context) { //needs a context object because we need this to access the database

    private var reminderDao: ReminderDao

    init{
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao() //constructed using the abstract method we added in the ReminderRoomDatabase class
    }

    fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }


    fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }

}