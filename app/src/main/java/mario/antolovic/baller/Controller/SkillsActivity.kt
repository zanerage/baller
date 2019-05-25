package mario.antolovic.baller.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skills.*
import mario.antolovic.baller.Model.Player

import mario.antolovic.baller.R
import mario.antolovic.baller.Utilities.EXTRA_PLAYER


class SkillsActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        }
    fun beginerClicked (view:View) {
        baller_button.isChecked = false
        player.skill = "beginner"
    }
    fun ballerClicked (view:View) {
        beg_button.isChecked = false
        player.skill = "baller"

    }

    fun skillClicked (view:View) {
        if (player.skill != "") {
            val finishActivity = Intent(this,FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }

}
