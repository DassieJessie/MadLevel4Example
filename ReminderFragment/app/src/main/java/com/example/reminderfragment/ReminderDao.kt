package com.example.reminderfragment

import androidx.room.*

//To get access to the Room database we are using a DAO(Data Access Object)
//A Dao can either be an interface or an abstract class

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable") //retrieve all reminders from the database
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}