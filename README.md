
  ![browser support](http://appbalo.com/wp-content/uploads/2014/08/Android-Central---The-App-.png)

  ![browser support](http://www.android.com/new/images/logos-2x/android-wordmark-8EC047.png)



<h2>Indice</h2>
<ul>
	<li><a href="#indiceLayout"> Layout1</a></li>
	<li><a href="#style"> Style</a></li>
	<li><a href="#reference">Links</a></li>
</ul>





<h3 id="indiceLayout">Layouts:</h3>



Layout1:


![alt text](https://courses.edx.org/c4x/UPValenciaX/AIP201x/asset/practica_layouts.png "Layout1")






Layout2:


![alt text](https://courses.edx.org/c4x/UPValenciaX/AIP201x/asset/practica_layouts1.png "Layout2")






Layout3:


![alt text](https://courses.edx.org/c4x/UPValenciaX/AIP201x/asset/practica_layouts2.png "Layout3")




<h3 id="style">Style</h3>

Style is like CSS.

Create new style:
<code> res/values/MiEstilo.xml</code>

Example:
<code>

<resources>

   <style name="MiEstilo"

     parent="@android:style/TextAppearance.Medium">

       <item name="android:layout_width">match_parent</item>

       <item name="android:layout_height">wrap_content</item>

       <item name="android:textColor">#00FF00</item>

       <item name="android:typeface">monospace</item>

   </style>

</resources>

</code>



Use:
When you have a TextView or other:
<code>
<TextView
	style="@style/MiEstilo

</code>
<h3 id="reference">Link:</h3>
http://developer.android.com/sdk/index.html


http://www.edx.org/course/jugando-con-android-aprende-programar-tu-uamx-android301x#.VO49hnV6_NM
