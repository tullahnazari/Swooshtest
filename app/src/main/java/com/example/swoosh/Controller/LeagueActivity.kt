package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.Extra_Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
        val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(Extra_Player, player)
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

        player.league = "mens"

    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"

    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeaguebtn.isChecked = false

        player.league = "co-ed"

    }
}
