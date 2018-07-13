# Generated by Django 2.0.7 on 2018-07-13 12:59

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('clientes', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='person',
            name='photo',
            field=models.ImageField(blank=True, null=True, upload_to='clents_photos'),
        ),
        migrations.AlterField(
            model_name='person',
            name='bio',
            field=models.TextField(blank=True, null=True),
        ),
    ]
