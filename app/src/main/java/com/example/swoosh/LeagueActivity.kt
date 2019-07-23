package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague!= "") {
        val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(Extra_League, selectedLeague)
        startActivity(skillActivity)
    }
        else {
            Toast.makeText(this, "Please select a league or go back", Toast.LENGTH_SHORT).show()
        }

        }

    fun gotowelcomepage(view: View) {
        val welcomeActivity = Intent(this, WelcomeActivity::class.java)
        startActivity(welcomeActivity)
    }

    fun onMensClicked(view: View) {
        womensLeaguebtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeaguebtn.isChecked = false

        selectedLeague = "co-ed"

    }
}
