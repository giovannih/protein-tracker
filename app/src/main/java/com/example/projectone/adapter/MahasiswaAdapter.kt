package com.example.projectone.adapter

import android.view.*
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import com.example.projectone.R
import com.example.projectone.models.ResponseMhsItem

class MahasiswaAdapter(val mhs: List<ResponseMhsItem>?):
    RecyclerView.Adapter<MahasiswaAdapter.MhsHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MahasiswaAdapter.MhsHolder {
        return MhsHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_mhs_api, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MahasiswaAdapter.MhsHolder, position: Int) {
        holder.bindMhs(mhs?.get(position))
    }

    override fun getItemCount(): Int {
        return mhs?.size ?: 0
    }

    class MhsHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            view.setOnLongClickListener {

                val pop = PopupMenu(view.context, it)
                pop.inflate(R.menu.menu_sample_list_view)

                pop.setOnMenuItemClickListener { item ->

                    when (item.itemId) {
                        R.id.menu_delete -> {

                        }

                    }
                    true
                }
                pop.show()
                true
            }
        }

        lateinit var txtNim: TextView
        lateinit var txtNama: TextView
        lateinit var txtfoto: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        fun bindMhs(mhs: ResponseMhsItem?) {
            itemView.apply {

//                rvUserAPI = findViewById(R.id.rvUserAPI)
                txtNim = findViewById(R.id.nim)
                txtNama = findViewById(R.id.namaMhs)
                txtfoto = findViewById(R.id.Foto)
                txtEmail = findViewById(R.id.Email)
                txtAlamat = findViewById(R.id.AlamatMhs)
                txtNim.text = mhs?.nim
                txtNama.text = mhs?.nama
                txtfoto.text = mhs?.foto
                txtEmail.text = mhs?.email
                txtAlamat.text = mhs?.alamat
            }
        }


    }
}
